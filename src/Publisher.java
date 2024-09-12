class Publisher {
    private int id;
    private String namePublisher;
    private String address;
    private String site;

    public Publisher(int id, String namePublisher, String address, String site) {
        this.id = id;
        this.namePublisher = namePublisher;
        this.address = address;
        this.site = site;
    }

    public int getId() { return id; }
    public String getNamePublisher() { return namePublisher; }
    public String getAddress() { return address; }
    public String getSite() { return site; }
}