package Room;
import java.util.ArrayList;
record Room(String type,String roomNumber) {
}
public class room {
    final ArrayList<Room> rooms = new ArrayList<>();
    public void addRoom(String type, String roomNumber) {
        Room rm = new Room(type, roomNumber);
        rooms.add(rm);
    } //添加客户

    public void removeRoom(String roomNumber) {
        for (Room room : rooms) {
            if (room.roomNumber().equals(roomNumber)) {
                rooms.remove(room);
                System.out.println( roomNumber + "删除成功");
                return;
            }
        }
    } //删除用户
}
