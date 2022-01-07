package java9;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class ProcessAPI {

    void method() {
        ProcessHandle self = ProcessHandle.current();
        long PID = self.pid();
        ProcessHandle.Info procInfo = self.info();

        Optional<String[]> args = procInfo.arguments();
        Optional<String> cmd =  procInfo.commandLine();
        Optional<Instant> startTime = procInfo.startInstant();
        Optional<Duration> cpuUsage = procInfo.totalCpuDuration();

        var childProc = ProcessHandle.current().children();
        childProc.forEach(ProcessHandle::destroy);
    }
}
