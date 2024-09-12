class Book {
    private int id;
    private int authorId;
    private int publishId;
    private String title;
    private String code;
    private int yearPublish;
    private int countPage;
    private boolean hardcover;
    private String abstractInfo;
    private boolean status;

    public Book(int id, int authorId, int publishId, String title, String code, int yearPublish, int countPage, boolean hardcover, String abstractInfo, boolean status) {
        this.id = id;
        this.authorId = authorId;
        this.publishId = publishId;
        this.title = title;
        this.code = code;
        this.yearPublish = yearPublish;
        this.countPage = countPage;
        this.hardcover = hardcover;
        this.abstractInfo = abstractInfo;
        this.status = status;
    }

    public int getId() { return id; }
    public int getAuthorId() { return authorId; }
    public int getPublishId() { return publishId; }
    public String getTitle() { return title; }
    public String getCode() { return code; }
    public int getYearPublish() { return yearPublish; }
    public int getCountPage() { return countPage; }
    public boolean isHardcover() { return hardcover; }
    public String getAbstractInfo() { return abstractInfo; }
    public boolean isStatus() { return status; }
}