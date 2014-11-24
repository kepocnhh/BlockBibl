package stan.block.note;

public class BlockError
	extends BlockBase
{
    String message;
    
    public BlockError(String m)
    {
        this.message = m;
    }
}