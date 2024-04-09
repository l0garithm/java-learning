public enum JobTitle {
    ATTENDANT("Flight Attendant"),
    MARSHALL("Air Marshall"),
    COPILOT("Co-Captain"),
    PILOT("Captain");

    private String title;
    public String getTitle() { return title; }
    private JobTitle(String title){
        this.title = title;
    }
}
