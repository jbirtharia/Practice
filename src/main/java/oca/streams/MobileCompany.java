package oca.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class MobileCompany {

    public String companyName;
    public List<User> users;
}
