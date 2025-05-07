package GDGoC_study.hello_spring;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/users")
public class UserController {
    private final Map<Integer, String> store = new HashMap<>();
    private int idCounter = 1;

    @PostMapping
    public String createUser(@RequestBody String name) {
        store.put(idCounter, name);
        return "User created with ID: " + (idCounter++);
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") int id) {
        return store.getOrDefault(id, "User not found");
    }



    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") int id, @RequestBody String name) {
        if (!store.containsKey(id)) return "User not found";
        store.put(id, name);
        return "User updated: ID = " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        if (store.remove(id) == null) return "User not found";
        return "User deleted: ID = " + id;
    }
}
