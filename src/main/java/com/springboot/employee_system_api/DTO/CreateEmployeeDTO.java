package com.springboot.employee_system_api.DTO;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CreateEmployeeDTO {
    private String firstName;
    private String lastName;
    private String emailId;
}
