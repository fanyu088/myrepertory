package com.example.RO;


public class AgentRO {
    private String name;
    private String adress;
    private Integer id;
    private Integer agentId;

    public AgentRO(String name, String adress, Integer id) {
        this.name = name;
        this.adress = adress;
        this.id = id;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public AgentRO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AgentRO{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", id=" + id +
                ", agentId=" + agentId +
                '}';
    }
}
