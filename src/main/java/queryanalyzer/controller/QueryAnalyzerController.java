package queryanalyzer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import queryanalyzer.model.QueryAnalyzerParam;
import queryanalyzer.service.QueryAnalyzerService;

@Slf4j
@RestController
@RequestMapping("/api/analyzer")
public class QueryAnalyzerController {

    private QueryAnalyzerService queryAnalyzerService;

    @Autowired
    public QueryAnalyzerController(QueryAnalyzerService queryAnalyzerService) {
        this.queryAnalyzerService = queryAnalyzerService;
    }

    @PostMapping(value = "/add-liked")
    @ResponseBody
    public ResponseEntity<?> addLikedPlace(@RequestBody QueryAnalyzerParam param) {
        log.info("addLikedPlace");

//        return ResponseEntity.ok(queryAnalyzerService.sendTextRecognizeEvent(param));

        return null;
    }
}
