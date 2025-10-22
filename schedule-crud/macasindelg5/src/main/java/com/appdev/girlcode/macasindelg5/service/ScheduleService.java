package com.appdev.girlcode.macasindelg5.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.appdev.girlcode.macasindelg5.entity.ScheduleEntity;
import com.appdev.girlcode.macasindelg5.repository.ScheduleRepository;

@Service // contains the business logic of ur system
public class ScheduleService {

    @Autowired
    ScheduleRepository srepo;

    public ScheduleService() {
        super();
    }

    // Create (C)
    public ScheduleEntity postScheduleRecord(ScheduleEntity schedule) {
        return srepo.save(schedule);
    }

    // Read (R)
    public List<ScheduleEntity> getAllSchedules() {
        return srepo.findAll();
    }

    @SuppressWarnings("finally")
    public ScheduleEntity updateSchedule(int schedule_id, ScheduleEntity newScheduleDetails) {
        ScheduleEntity schedule = new ScheduleEntity();
        try {
            //search the id number of the schedule that will be updated
            schedule = srepo.findById(schedule_id).get();
            //update the record
            schedule.setSchedule_name(newScheduleDetails.getSchedule_name());
            schedule.setIs_saved(newScheduleDetails.getIs_saved());
        } catch (NoSuchElementException ex) {
            throw new NoSuchElementException("Schedule " + schedule_id + " does not exist!");
        } finally {
            return srepo.save(schedule);
        }
    }

    // Delete
    //return type for delete is string bcs were jst going to print a success delete message
    public String deleteSchedule(int schedule_id) {
        String msg = "";

        if (srepo.findById(schedule_id) != null) {
            srepo.deleteById(schedule_id);
            msg = "Schedule " + schedule_id + " is successfully deleted";
        } else {
            msg = "Schedule " + schedule_id + " does not exist";
        }

        return msg;
    }



    /*// Update
    @SuppressWarnings("finally")
    public StudentEntity updateStudent (int id, StudentEntity newStudentDetails){
        StudentEntity student = new StudentEntity();
        try {
            //search the id number of the schedule that will be updated
            student = srepo.findById(id).get();
            //update the record
            student.setFname(newStudentDetails.getFname());
            student.setLname(newStudentDetails.getLname());
            student.setProgram(newStudentDetails.getProgram());
        }catch(NoSuchElementException ex){
            throw new NoSuchElementException("Student" +id+" does not exist!");
        }finally{
            return srepo.save(student);
        }
    }
    //Delete
    //return type for delete is string bcs were jst going to print a success delete message
    public String deleteStudent(int id){
        String msg = ""
        
        if(srepo.findById(id) != null){
            srepo.deleteById(id);
            msg = "Student " +id+ "is successfully deleted";
        }else{
            msg = "Student " +id+ "does not exist";
        }
        return msg;
    }*/
}
