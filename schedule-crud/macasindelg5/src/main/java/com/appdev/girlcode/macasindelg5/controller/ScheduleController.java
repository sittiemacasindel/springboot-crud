package com.appdev.girlcode.macasindelg5.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.appdev.girlcode.macasindelg5.entity.ScheduleEntity;
import com.appdev.girlcode.macasindelg5.service.ScheduleService;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

    @Autowired
    ScheduleService sserv;

    @GetMapping("/print")
    public String print() {
        return "Hello, Firstname Lastname";
    }

    // Create (C)
    @PostMapping("/postScheduleRecord")
    public ScheduleEntity postScheduleRecord(@RequestBody ScheduleEntity schedule) {
        return sserv.postScheduleRecord(schedule);
    }

    // Read (R)
    @GetMapping("/getAllSchedules")
    public List<ScheduleEntity> getAllSchedules() {
        return sserv.getAllSchedules();
    }

    //Update
    @PutMapping("/updateSchedule")
    public ScheduleEntity updateSchedule(@RequestParam int schedule_id, @RequestBody ScheduleEntity newScheduleDetails) {
        return sserv.updateSchedule(schedule_id, newScheduleDetails);
    }

    //Delete
    @DeleteMapping("/deleteSchedule/{schedule_id}")
    public String deleteSchedule(@PathVariable int schedule_id) {
        return sserv.deleteSchedule(schedule_id);
    }

    
    /*//Update
    @PutMapping("/updateStudent")
    public StudentEntity updateStudent (@RequestParam int id, @RequestBody StudentEntity newStudentDetails){
        return sserv.updateStudent(id, newStudentDetails);
    } 

    //Delete
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id){
        return sserv.deleteStudent(id);
    }*/
}
