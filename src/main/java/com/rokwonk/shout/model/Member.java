package com.rokwonk.shout.model;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Entity
@Table(name = "member")
public class Member {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String oauthType;
  String oauthId;
  String token;

  String nickname;
  String thumbnailImage;
  String profileImage;
  String fcmToken;
  Boolean alarmOn;
  LocalDate createdAt;
  LocalDate updatedAt;
}
