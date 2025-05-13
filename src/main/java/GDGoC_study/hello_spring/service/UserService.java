package GDGoC_study.hello_spring.service;

import GDGoC_study.hello_spring.model.User;
import GDGoC_study.hello_spring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User register(User user) {
        return userRepository.save(user);
    }

    public User update(Long id, User newUserData) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));

        user.setEmail(newUserData.getEmail());
        user.setNickname(newUserData.getNickname());
        user.setPassword(newUserData.getPassword());

        return user;
    }
    // 조회
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));
    }

    // 삭제
    public void delete(Long id) {
        if (!userRepository.existsById(id)) {
            throw new IllegalArgumentException("삭제할 사용자가 없습니다.");
        }
        userRepository.deleteById(id);
    }
}