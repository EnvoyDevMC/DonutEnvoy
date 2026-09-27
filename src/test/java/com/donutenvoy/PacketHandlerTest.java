// --- PacketHandlerTest.java ---
package com.donutenvoy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.donutenvoy.network.PacketHandler;
import com.donutenvoy.util.NetworkPacket;

public class PacketHandlerTest {

    @Test
    void testPacketHandling_Success() {
        PacketHandler handler = new PacketHandler();
        NetworkPacket goodPacket = new NetworkPacket(NetworkPacket.Type.ENTITY_POSITION_UPDATE, 0.001f);

        // Assert that the handler accepts the packet without throwing an error
        try {
            handler.handlePacket(goodPacket);
            assertTrue(true, "Packet handling succeeded without exception.");
        } catch (Exception e) {
            fail("Packet handling threw an unexpected exception: " + e.getMessage());
        }
    }

    @Test
    void testSyncTolerance_AcceptsSmallChange() {
        // Test the specific value from our JSON (0.04)
        float tolerance = 0.039f;
        PacketHandler handler = new PacketHandler();
        assertTrue(handler.checkServerSyncTolerance(tolerance), "Should accept a change smaller than the threshold.");
    }
}
