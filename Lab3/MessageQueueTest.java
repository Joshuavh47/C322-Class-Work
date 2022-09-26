import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageQueueTest {

    @Test
    void mod(){
        MessageQueue m = new MessageQueue(2);
        for(int i=0;i<1000;i++){
            m.add(new Message("Hello"));
            assertEquals(0, (m.getTail()-m.getHead()-m.getCount())%m.getElementsLength());
        }

    }
}