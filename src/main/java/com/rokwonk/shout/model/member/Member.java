package com.rokwonk.shout.model.member;

import com.rokwonk.shout.common.enums.AuthType;
import com.rokwonk.shout.model.motto.Motto;
import com.rokwonk.shout.model.motto.MottoBookmark;
import com.rokwonk.shout.model.motto.MottoReaction;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.Comment;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "member")
public class Member {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
  private List<Motto> mottoList = new ArrayList<>();

  @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
  private List<MottoBookmark> mottoBookmarkList = new ArrayList<>();

  @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
  private List<MottoReaction> mottoReactionList = new ArrayList<>();

  @Enumerated(EnumType.STRING)
  private AuthType oauthType;

  private String oauthId;

  @Column(length = 255)
  private String token;

  @Column(length = 50)
  @Size(min = 2, max = 10)
  private String nickname;

  private String thumbnailImage;

  private String profileImage;

  private String fcmToken;

  @Builder.Default
  private Boolean alarmOn = false;
}
