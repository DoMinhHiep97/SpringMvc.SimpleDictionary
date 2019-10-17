package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/dictionary")
    public String dictionary(@RequestParam String english, Model model){

        Map<String,String> dic=new HashMap<>();
        {
            dic.put("hello", "Xin chao");
            dic.put("how", "Nhu The Nao");
            dic.put("book", "quyen vo");
        }
        String vn=dic.get(english);
        model.addAttribute("vn",vn);
        return "index";
    }
}
