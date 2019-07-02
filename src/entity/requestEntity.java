package entity;

public class requestEntity{
    private byte func;
    private byte dataType;
    private byte[] line=new byte[6];
    private byte[] car = new byte[4];
    private byte[] cmd = new byte[4];

    public byte getFunc() {
        return func;
    }

    public byte[] getCar() {
        return car;
    }

    public void setCar(byte[] car) {
        this.car = car;
    }

    public byte[] getCmd() {
        return cmd;
    }

    public void setCmd(byte[] cmd) {
        this.cmd = cmd;
    }

    public byte[] getLine() {
        return line;
    }

    public void setLine(byte[] line) {
        this.line = line;
    }

    public byte getDataType() {
        return dataType;
    }

    public void setDataType(byte dataType) {
        this.dataType = dataType;
    }

    public void setFunc(byte func) {
        this.func = func;
    }

}