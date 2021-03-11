package ru.jdm.timesheet.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class User {
  private Long userId;
  private String login;
  private String name;
  private String surname;
}
