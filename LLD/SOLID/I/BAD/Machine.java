package LLD.SOLID.I.BAD;

// 🚨 ONE FAT interface trying to cover everything
public interface Machine {
    void print(String content);
    void scan(String content);
    void fax(String content);
}


