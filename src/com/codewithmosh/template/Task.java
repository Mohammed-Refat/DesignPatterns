package com.codewithmosh.template;

public abstract class Task {

    private AuditTrail auditTrail;

    public task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        doExecute();
    }

    public abstract void doExecute();
}
