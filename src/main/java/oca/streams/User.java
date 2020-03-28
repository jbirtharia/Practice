package oca.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class User {

    public String name;
    public Integer age;
   public Boolean isValid;
}
