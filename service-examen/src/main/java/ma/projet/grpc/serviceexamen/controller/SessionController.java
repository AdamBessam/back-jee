package ma.projet.grpc.serviceexamen.controller;

import ma.projet.grpc.serviceexamen.entity.Session;
import ma.projet.grpc.serviceexamen.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class SessionController {
    @Autowired
    private SessionService sessionService;
    @GetMapping
    public List<Session> getAllSessions() {
        return sessionService.getAllSessions();
    }

    @GetMapping("/{id}")
    public Session getSessionById(@PathVariable Long id) {
        return sessionService.getSessionById(id);
    }
    @PostMapping
    public ResponseEntity<Session> createSession(@RequestBody Session session) {
        Session savedSession = sessionService.saveSession(session);
        System.out.println(savedSession);
        return ResponseEntity.ok(savedSession);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSession(@PathVariable Long id) {
        if (sessionService.getSessionById(id)==null) {
            return ResponseEntity.notFound().build();
        }
        sessionService.deleteSessionById(id);
        return ResponseEntity.noContent().build();
    }


}
