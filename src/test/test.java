package test;
import entity.requestEntity;

public class test{
    public static void main(String[] args) {
        requestEntity rEntity=new requestEntity();
        rEntity.setFunc(new Byte("0"));
        rEntity.setDataType(new Byte("1"));
        byte[] car={0,0,0,0};
        rEntity.setCar(car);
        byte[] line={0,0,0,0,0,0};
        rEntity.setLine(line);
        byte[] cmd={0,0,0,0};
        rEntity.setCmd(cmd);
        
        System.out.println(rEntity);
    }
}