package sh.love.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sh.love.service.TmpService;

@Component
public class Test {

    @Autowired
    private TmpService tmpService;

    public void a() {
        tmpService.list();
    }
}
