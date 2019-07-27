package cd.feature.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lcb 2019/7/27
 */
@RestController
@RequestMapping("/user")
public class UserApi {
    @GetMapping("/get")
    public String getUser() {
        return "231312";
    }
}
