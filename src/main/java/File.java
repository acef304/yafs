class File {
    short attributes;
    byte[] content;

    public File(byte[] content, short attributes) {
        this.content = content;
        this.attributes = attributes;
    }

}