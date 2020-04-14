package org.primefaces.test;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.inject.Inject;

public class LoginController implements PhaseListener {

	@Inject
	protected WebSession ws;

	@Override
	public void beforePhase(PhaseEvent event) {}

	@Override
	public void afterPhase(PhaseEvent event) {
		// Try to use ws
		ws.getName();
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}

}