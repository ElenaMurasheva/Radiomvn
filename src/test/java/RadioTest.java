import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetMiddleSt() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAbove9() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelow0() {
        Radio radio = new Radio();
        radio.setCurrentStation(-5);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMiddleVol() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        int expected = 7;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAbove10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeBelow0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-8);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextMiddleSt() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.next();
        int expected = 3;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStAfter9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStAfter0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStBelow0() {
        Radio radio = new Radio();
        radio.setCurrentStation(-15);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStAbove10() {
        Radio radio = new Radio();
        radio.setCurrentStation(25);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevMiddleSt() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prev();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStAbove9() {
        Radio radio = new Radio();
        radio.setCurrentStation(14);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevSt9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevSt0() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStBelow0() {
        Radio radio = new Radio();
        radio.setCurrentStation(-7);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.increaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeAbove10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(18);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolumeBelow0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeAbove10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeBelow0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-30);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
