package com.rokwonk.shout.model.motto;

import com.rokwonk.shout.common.enums.ReactionType;
import com.rokwonk.shout.model.BaseTime;
import com.rokwonk.shout.model.member.Member;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "motto_reaction")
public class MottoReaction extends BaseTime {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  private ReactionType type;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "member_id")
  private Member member;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "motto_id")
  private Motto motto;
}
