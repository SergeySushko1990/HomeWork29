package ru.learnUp.learnupjava23.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class AuthorViewForBook {

    private Long id;

    private String fullName;
}
