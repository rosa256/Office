package com.myoffice.office.controllers.rests;

import com.myoffice.office.models.EarningsLevel;
import com.myoffice.office.services.EarningsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EarningsController {

    private EarningsService earningsService;

    @Autowired
    public EarningsController(EarningsService earningsService) {
        this.earningsService = earningsService;
    }

    @PostMapping("/earnings")
    public EarningsLevel addEaringnsLvl(@RequestBody EarningsLevel earningsLevel){
        return earningsService.addEarningsLvl(earningsLevel);
    }

}
