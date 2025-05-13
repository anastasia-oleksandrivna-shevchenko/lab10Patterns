package task1.order;

import java.util.List;

interface InventoryService {
    boolean checkAvailability(List<OrderItem> items);
    void updateInventory(List<OrderItem> items);
}
