package com.eWinInternational;

import java.util.ArrayList;
import java.util.List;

public class RetentionOfficeTeam {
    private String teamId;
    private String teamName;
    private List<String> staffMembers;

    public RetentionOfficeTeam() {
        this.staffMembers = new ArrayList<>();
    }

    public void addMember(String member) {
        staffMembers.add(member);
    }

    public List<String> getMembers() {
        return staffMembers;
    }

    public void removeMember(String member) {
        staffMembers.remove(member);
    }
}
