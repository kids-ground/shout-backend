package com.rokwonk.shout.model.motto;

import com.rokwonk.shout.model.BaseTime;
import com.rokwonk.shout.model.member.Member;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "motto")
public class Motto extends BaseTime {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToMany(mappedBy = "motto", cascade = CascadeType.REMOVE)
  private List<MottoBookmark> mottoBookmarkList = new ArrayList<>();

  @OneToMany(mappedBy = "motto", cascade = CascadeType.REMOVE)
  private List<MottoReaction> mottoReactionList = new ArrayList<>();

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "member_id")
  private Member member;

  @Column(length = 6, nullable = false)
  private String backgroundColor;


  @Size(min = 2, max = 255)
  @Column(length = 255)
  private String content;
}
