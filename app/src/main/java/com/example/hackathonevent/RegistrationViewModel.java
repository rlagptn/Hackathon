package com.example.hackathonevent;

import androidx.lifecycle.ViewModel;

public class RegistrationViewModel extends ViewModel {
    private String teamName;
    private String teamLeader;
    private String member1;
    private String member2;
    private String leaderEmail;
    private String memberEmail1;
    private String memberEmail2;

    // Getter and Setter methods
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(String teamLeader) {
        this.teamLeader = teamLeader;
    }

    public String getLeaderEmail() {
        return leaderEmail;
    }

    public void setLeaderEmail(String leaderEmail) {
        this.leaderEmail = leaderEmail;
    }

    public String getMember1() {
        return member1;
    }

    public void setMember1(String member1) {
        this.member1 = member1;
    }

    public String getMemberEmail1() { return memberEmail1; }

    public void setMemberEmail1(String memberEmail1) { this.memberEmail1 = memberEmail1; }

    public String getMember2() {
        return member2;
    }

    public void setMember2(String member2) { this.member2 = member2; }

    public String getMemberEmail2() {
        return memberEmail2;
    }

    public void setMemberEmail2(String memberEmail2) {
        this.memberEmail2 = memberEmail2;
    }
}
