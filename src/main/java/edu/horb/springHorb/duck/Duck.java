package edu.horb.springHorb.duck;/*
  @author Bogdan
  @project springHorb
  @class duck
  @version 1.0.0
  @since 29.09.2025 - 20.55
*/


import lombok.*;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Duck {
    @Id
    private String Id;
    private String name;
    private String description;

    public Duck(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return Objects.equals(Id, duck.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }
}
