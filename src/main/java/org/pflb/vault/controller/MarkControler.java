package org.pflb.vault.controller;


import org.pflb.vault.model.Course;
import org.pflb.vault.model.Mark;
import org.pflb.vault.model.Student;
import org.pflb.vault.service.ManagingService;
import org.pflb.vault.service.MarkCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class MarkControler {

    @Qualifier("persistent_mark")

    @Autowired
    private MarkCache storageMark;

    @Autowired
    private ManagingService markManagingService;

    @PostMapping(value = "/mark/{studentId}/{courseId}/{mark}")
    //("marks/{name_student}/{name_course}/{mark}")
    public String createMark(@PathVariable Long studentId, @PathVariable Long courseId, @PathVariable int mark) {

        Mark marks = markManagingService.createMark(studentId, courseId, mark);
        storageMark.saveMark(marks);

        return "Мы добавили, " + marks.toString();
    }

}