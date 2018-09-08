/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jee18.logic;

import java.util.List;
import jee18.dto.Timesheet;

/**
 *
 * @author okaracalik
 */
public interface ITimesheetSystem {
    
    public List<Timesheet> list();

    public Timesheet add(Timesheet t);

    public Timesheet get(String uuid);

    // RULE: if not archived
    public Integer update(String uuid, Timesheet t);

    // RULE: if not signed
    // RULE: if not archived
    public Integer delete(String uuid);
    
    public Integer setStatusToInProgress(String uuid);

    public Integer setStatusToSignedByEmployee(String uuid);

    // TASK: setStatusToInProgress
    public Integer revokeEmployeeSignature(String uuid);
    
    // RULE: if signed by employee
    public Integer setStatusToSignedBySupervisor(String uuid);

    // TASK: setStatusToInProgress
    public Integer requestChanges(String uuid);
    
    // RULE: if signed by supervisor
    public Integer setStatusToArchived(String uuid);
    
    public void print();
    
}