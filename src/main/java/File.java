import java.time.Instant;

class File {
    short attributes;
    byte[] content;

    long ctimesec;
    int ctimensec;

    long mtimesec;
    int mtimensec;

    long atimesec;
    int atimensec;

    int uid;
    int gid;

    public File(byte[] content, short attributes) {
        this.content = content;
        this.attributes = attributes;

        Instant now = Instant.now();
        this.ctimesec = now.getEpochSecond();
        this.ctimensec = now.getNano();
        this.mtimesec = now.getEpochSecond();
        this.mtimensec = now.getNano();
        this.atimesec = now.getEpochSecond();
        this.atimensec = now.getNano();

        this.uid = 501;              //FIXME
        this.gid = 20;               //FIXME
    }

}