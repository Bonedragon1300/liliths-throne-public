package com.lilithsthrone.game.sex.sexActions.universal;

import com.lilithsthrone.game.character.attributes.CorruptionLevel;
import com.lilithsthrone.game.dialogue.utils.UtilText;
import com.lilithsthrone.game.sex.ArousalIncrease;
import com.lilithsthrone.game.sex.Sex;
import com.lilithsthrone.game.sex.SexAreaOrifice;
import com.lilithsthrone.game.sex.SexAreaPenetration;
import com.lilithsthrone.game.sex.SexFlags;
import com.lilithsthrone.game.sex.SexPace;
import com.lilithsthrone.game.sex.SexParticipantType;
import com.lilithsthrone.game.sex.SexPositionSlot;
import com.lilithsthrone.game.sex.SexPositionType;
import com.lilithsthrone.game.sex.managers.dominion.SMMilkingStall;
import com.lilithsthrone.game.sex.sexActions.SexAction;
import com.lilithsthrone.game.sex.sexActions.SexActionLimitation;
import com.lilithsthrone.game.sex.sexActions.SexActionType;
import com.lilithsthrone.main.Main;
import com.lilithsthrone.utils.Util;
import com.lilithsthrone.utils.Util.Value;

/**
 * @since 0.2.8
 * @version 0.2.8
 * @author Innoxia
 */
public class MilkingStall {

	public static final SexAction PLAYER_SWITCH_TO_BEHIND = new SexAction(
			SexActionType.POSITIONING,
			ArousalIncrease.ONE_MINIMUM,
			ArousalIncrease.ONE_MINIMUM,
			CorruptionLevel.ZERO_PURE,
			null,
			SexParticipantType.NORMAL) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.PLAYER_ONLY;
		}

		@Override
		public boolean isBaseRequirementsMet() {
			return !SexFlags.positioningBlockedPlayer
					&& !(Sex.getPosition() == SexPositionType.MILKING_STALL && Sex.getSexPositionSlot(Main.game.getPlayer()) == SexPositionSlot.MILKING_STALL_FUCKING)
					&& Sex.isDom(Main.game.getPlayer());
		}
		
		@Override
		public String getActionTitle() {
			return "Move behind";
		}

		@Override
		public String getActionDescription() {
			return "Move around behind [npc.name] and get ready to fuck [npc.herHim].";
		}

		@Override
		public String getDescription() {
			return "Deciding that you want to fuck [npc.name] while [npc.sheIs] locked in the stocks, you step step up behind [npc.herHim] and start grinding your groin up against [npc.her] [npc.ass+]."
					+ " Taking hold of [npc.her] [npc.hips+], you [pc.moan], "
					+ "[pc.speech(Be a good [npc.girl] and hold still while I fuck you!)]";
		}

		@Override
		public void applyEffects() {
			Sex.setSexManager(new SMMilkingStall(
					Util.newHashMapOfValues(new Value<>(Main.game.getPlayer(), SexPositionSlot.MILKING_STALL_FUCKING)),
					Util.newHashMapOfValues(new Value<>(Sex.getActivePartner(), SexPositionSlot.MILKING_STALL_LOCKED_IN_MILKING_STALL))));
			
			SexFlags.resetRequests();
		}
	};
	
	public static final SexAction PLAYER_SWITCH_TO_GIVING_ORAL = new SexAction(
			SexActionType.POSITIONING,
			ArousalIncrease.ONE_MINIMUM,
			ArousalIncrease.ONE_MINIMUM,
			CorruptionLevel.ZERO_PURE,
			null,
			SexParticipantType.NORMAL) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.PLAYER_ONLY;
		}

		@Override
		public boolean isBaseRequirementsMet() {
			return !SexFlags.positioningBlockedPlayer
					&& !(Sex.getPosition() == SexPositionType.MILKING_STALL && Sex.getSexPositionSlot(Main.game.getPlayer()) == SexPositionSlot.MILKING_STALL_PERFORMING_ORAL)
					&& Sex.isDom(Main.game.getPlayer());
		}
		
		@Override
		public String getActionTitle() {
			return "Perform oral";
		}

		@Override
		public String getActionDescription() {
			return "Kneel behind [npc.name] and perform oral on [npc.herHim].";
		}

		@Override
		public String getDescription() {
			return "Deciding that you want to perform oral on [npc.name], you kneel down behind [npc.herHim]."
					+ " Bringing your mouth up to [npc.her] groin, you [pc.moan], "
					+ "[pc.speech(You're going to love this!)]";
		}

		@Override
		public void applyEffects() {
			Sex.setSexManager(new SMMilkingStall(
					Util.newHashMapOfValues(new Value<>(Main.game.getPlayer(), SexPositionSlot.MILKING_STALL_PERFORMING_ORAL)),
					Util.newHashMapOfValues(new Value<>(Sex.getActivePartner(), SexPositionSlot.MILKING_STALL_LOCKED_IN_MILKING_STALL))));
			
			SexFlags.resetRequests();
		}
	};
	
	public static final SexAction PLAYER_SWITCH_TO_ORAL = new SexAction(
			SexActionType.POSITIONING,
			ArousalIncrease.ONE_MINIMUM,
			ArousalIncrease.ONE_MINIMUM,
			CorruptionLevel.ZERO_PURE,
			null,
			SexParticipantType.NORMAL) {
		@Override
		public SexActionLimitation getLimitation() {
			return SexActionLimitation.PLAYER_ONLY;
		}

		@Override
		public boolean isBaseRequirementsMet() {
			return !SexFlags.positioningBlockedPlayer
					&& !(Sex.getPosition() == SexPositionType.MILKING_STALL && Sex.getSexPositionSlot(Main.game.getPlayer()) == SexPositionSlot.MILKING_STALL_RECEIVING_ORAL)
					&& Sex.isDom(Main.game.getPlayer());
		}
		
		@Override
		public String getActionTitle() {
			return "Move to front";
		}

		@Override
		public String getActionDescription() {
			return "Decide to use [npc.namePos] mouth.";
		}

		@Override
		public String getDescription() {
			return "Deciding that you want to use [npc.namePos] mouth, you step back, before moving around in front of [npc.her] [npc.face]."
					+ " Bringing your groin up to [npc.her] mouth, you [pc.moan], "
					+ "[pc.speech(You're going to love this!)]";
		}

		@Override
		public void applyEffects() {
			Sex.setSexManager(new SMMilkingStall(
					Util.newHashMapOfValues(new Value<>(Main.game.getPlayer(), SexPositionSlot.MILKING_STALL_RECEIVING_ORAL)),
					Util.newHashMapOfValues(new Value<>(Sex.getActivePartner(), SexPositionSlot.MILKING_STALL_LOCKED_IN_MILKING_STALL))));
			
			SexFlags.resetRequests();
		}
	};

	public static final SexAction PLAYER_SLAP_ASS = new SexAction(
			SexActionType.ONGOING,
			ArousalIncrease.TWO_LOW,
			ArousalIncrease.THREE_NORMAL,
			CorruptionLevel.TWO_HORNY,
			null,
			SexParticipantType.NORMAL,
			SexPace.DOM_ROUGH) {
	@Override
	public SexActionLimitation getLimitation() {
		return SexActionLimitation.PLAYER_ONLY;
	}
		
		@Override
		public boolean isBaseRequirementsMet() {
			return Sex.isDom(Main.game.getPlayer())
					&& (Sex.getPosition() == SexPositionType.MILKING_STALL && Sex.getSexPositionSlot(Main.game.getPlayer()) == SexPositionSlot.MILKING_STALL_FUCKING);
		}
		
		@Override
		public String getActionTitle() {
			return "Slap ass";
		}

		@Override
		public String getActionDescription() {
			return "Start slapping [npc.namePos] ass.";
		}

		@Override
		public String getDescription() {
			String tailSpecial1 = "", tailSpecial2 = "";
			
			if (Sex.getAllContactingSexAreas(Sex.getActivePartner(), SexAreaOrifice.VAGINA).contains(SexAreaPenetration.PENIS)) {
				switch(Sex.getActivePartner().getTailType()) {
					case NONE:
						tailSpecial1 = "Hilting your [pc.cock+] deep inside [npc.namePos] [npc.pussy+], you reach down and roughly grope [npc.her] [npc.ass+], before starting to deliver a series of stinging slaps to [npc.her] exposed cheeks.";
						break;
					default:
						tailSpecial1 = "Hilting your [pc.cock+] deep inside [npc.namePos] [npc.pussy+], you roughly grab the base of [npc.her] [npc.tail+] and yank upwards,"
											+ " raising [npc.her] [npc.ass+] up high in the air before starting to deliver a series of stinging slaps to [npc.her] exposed cheeks.";
						break;
				}
				switch(Sex.getActivePartner().getTailType()) {
					case NONE:
						tailSpecial2 = "Still ploughing away at [npc.her] [npc.pussy+], you growl down that you're going to put [npc.name] in [npc.her] place before starting to aggressively slap [npc.her] exposed ass cheeks.";
						break;
					default:
						tailSpecial2 = "Still ploughing away at [npc.her] [npc.pussy+], you grab the base of [npc.namePos] [npc.tail+] in one [pc.hand],"
											+ " roughly yanking [npc.her] [npc.ass+] up high in the air before starting to aggressively slap [npc.her] exposed cheeks.";
						break;
				}
			
				return UtilText.parse(Sex.getActivePartner(),
					UtilText.returnStringAtRandom(
							tailSpecial1,
							tailSpecial2,
							"[npc.Name] lets out [npc.a_moan+] as you start slapping [npc.her] [npc.ass+] in time with your powerful thrusts into [npc.her] [npc.pussy+].",
							"Hilting your [pc.cock+] deep inside [npc.namePos] [npc.pussy], you use one [pc.hand] to hold [npc.herHim] still, while using your other to deliver a series of stinging slaps to [npc.her] exposed ass cheeks.",
							"While you continue pounding away at [npc.namePos] [npc.pussy+], you reach down and start to roughly slap [npc.her] [npc.ass+], growling in glee as [npc.she] squirms and squeals under your stinging blows."));
				
			} else if (Sex.getAllContactingSexAreas(Sex.getActivePartner(), SexAreaOrifice.ANUS).contains(SexAreaPenetration.PENIS)) {
				switch(Sex.getActivePartner().getTailType()) {
					case NONE:
						tailSpecial1 = "Hilting your [pc.cock+] deep inside [npc.namePos] [npc.asshole+], you reach down and roughly grope [npc.her] [npc.ass+], before starting to deliver a series of stinging slaps to [npc.her] exposed cheeks.";
						break;
					default:
						tailSpecial1 = "Hilting your [pc.cock+] deep inside [npc.namePos] [npc.asshole+], you roughly grab the base of [npc.her] [npc.tail+] and yank upwards,"
											+ " raising [npc.her] [npc.ass+] up high in the air before starting to deliver a series of stinging slaps to [npc.her] exposed cheeks.";
						break;
				}
				switch(Sex.getActivePartner().getTailType()) {
					case NONE:
						tailSpecial2 = "Still ploughing away at [npc.her] [npc.asshole+], you growl down that you're going to put [npc.name] in [npc.her] place before starting to aggressively slap [npc.her] exposed ass cheeks.";
						break;
					default:
						tailSpecial2 = "Still ploughing away at [npc.her] [npc.asshole+], you grab the base of [npc.namePos] [npc.tail+] in one [pc.hand],"
											+ " roughly yanking [npc.her] [npc.ass+] up high in the air before starting to aggressively slap [npc.her] exposed cheeks.";
						break;
				}
			
				return UtilText.parse(Sex.getActivePartner(),
					UtilText.returnStringAtRandom(
							tailSpecial1,
							tailSpecial2,
							"[npc.Name] lets out [npc.a_moan+] as you start slapping [npc.her] [npc.ass+] in time with your powerful thrusts into [npc.her] [npc.asshole+].",
							"Hilting your [pc.cock+] deep inside [npc.namePos] [npc.asshole], you use one [pc.hand] to hold [npc.herHim] still, while using your other to deliver a series of stinging slaps to [npc.her] exposed ass cheeks.",
							"While you continue pounding away at [npc.namePos] [npc.asshole+], you reach down and start to roughly slap [npc.her] [npc.ass+], growling in glee as [npc.she] squirms and squeals under your stinging blows."));
				
			} else {
				switch(Sex.getActivePartner().getTailType()) {
					case NONE:
						tailSpecial1 = "Growling down into [npc.namePos] [npc.ear+], you reach down and grab [npc.her] waist, using one hand to hold [npc.herHim] still,"
											+ " while using your other to deliver a series of stinging slaps to [npc.her] [npc.ass+].";
						break;
					default:
						tailSpecial1 = "Growling down into [npc.namePos] ear, you roughly grab the base of [npc.her] [npc.tail+] and yank upwards,"
									+ " raising [npc.her] [npc.ass+] up high in the air before starting to deliver a series of stinging slaps to [npc.her] exposed cheeks.";
						break;
				}
				switch(Sex.getActivePartner().getTailType()) {
					case NONE:
						tailSpecial2 = "You reach down and grab [npc.namePos] waist with one hand, holding [npc.herHim] firmly in your grip as you start to aggressively slap [npc.her] exposed cheeks.";
						break;
					default:
						tailSpecial2 = "You reach down and grab the base of [npc.namePos] [npc.tail+], causing [npc.herHim] to let out a surprised yelp as you roughly yank upwards,"
											+ " forcing [npc.herHim] to push [npc.her] [npc.ass+] up high in the air as you start to aggressively slap [npc.her] exposed cheeks.";
						break;
				}
			
				return UtilText.parse(Sex.getActivePartner(),
					UtilText.returnStringAtRandom(
							tailSpecial1,
							tailSpecial2,
							"[npc.Name] lets out [npc.a_moan+] as you start roughly slapping [npc.her] [npc.ass+], and you find yourself grinning in glee as you watch [npc.herHim] squirm and cry out beneath your stinging blows.",
							"[npc.Name] lets out a startled wail as you start to roughly slap [npc.her] [npc.ass+], and you quickly find yourself grinning in glee as you watch [npc.herHim] squirm and wail beneath your relentless blows.",
							"You growl down that you're going to put [npc.name] in [npc.her] place, before starting to aggressively slap [npc.her] [npc.ass+],"
									+ " smirking down at [npc.her] submissive form as [npc.she] squeals and cries out beneath your relentless blows."));
			}
		}
		
	};
}
