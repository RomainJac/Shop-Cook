package l3.miage.shopcook.Controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.validation.Valid;
import l3.miage.shopcook.dto.UserDto;
import l3.miage.shopcook.entity.user.User;
import l3.miage.shopcook.services.UserService;

import java.util.List;

@Controller
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/index")
    public String home() {
        return "index.html";
    }

    @GetMapping("/login")
    public String loadLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login.html";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new UserDto());
        return "register.html";
    }

    @PostMapping(path = "/register/save", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String registration(@Valid @ModelAttribute("user") UserDto userDto,
                               BindingResult result,
                               RedirectAttributes redirectAttributes) {
        User existingUser = userService.findUserByEmail(userDto.getEmail());

        if (existingUser != null && existingUser.getEmail() != null && !existingUser.getEmail().isEmpty()) {
            result.rejectValue("email", null, "There is already an account registered with the same email");
        }

        if (result.hasErrors()) {
            return "register.html";
        }

        userService.saveUser(userDto);
        redirectAttributes.addFlashAttribute("successMessage", "Registration successful");
        return "redirect:/register";
    }

    @GetMapping("/users")
    public String users(Model model) {
        List<UserDto> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "users.html";
    }
}
