package sh.love.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sh.love.config.Test;
import sh.love.model.TmpBoard;
import sh.love.model.TmpComment;
import sh.love.service.TmpService;

@RestController
public class TmpApiController {

    private static final String TMP_BOARD = "tmpBoard";

    @Autowired
    private TmpService tmpService;

    @RequestMapping(value = "/tmpSave")
    @ResponseBody
    public String tmpSave(@RequestBody TmpBoard tmpBoard) {
        System.out.println(tmpBoard.toString());
        tmpBoard.setBoardCd(TMP_BOARD);
        tmpService.save(tmpBoard);
        return "true";
    }

    @RequestMapping("/tmpList")
    @ResponseBody
    public String tmpList() {
        return new Gson().toJson(tmpService.list()).toString();
    }

    @RequestMapping("/get")
    @ResponseBody
    public String get(@RequestBody TmpBoard tmpBoard) {
        return new Gson().toJson(tmpService.get(tmpBoard.getSn())).toString();
    }

    @RequestMapping("/commentSave")
    @ResponseBody
    public void commentSave(TmpComment tmpComment) {
        System.out.println(tmpComment.toString());
        tmpService.commentSave(tmpComment);
    }


}
