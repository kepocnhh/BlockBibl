package stan.block.note;import java.io.Serializable;import java.util.Date;public class BlockBase //Базовый класс        implements Serializable{//Поля    public String version; //название версии для синхронизации клиента и сервера    public Date date; //дата создания объекта    public int UI; //уникальный идентификатор    public TypeMessage TM; //причина отправки    public static enum TypeMessage    {        add,  rewrite;    }        //Методы        //Конструкторы    public BlockBase()    {        this.date = new Date();        this.UI = this.hashCode();        this.TM = TypeMessage.add;    }}