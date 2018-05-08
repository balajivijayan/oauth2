package me.balaji.oauth.resource.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhotoController {

	@RequestMapping("/api/photo")
	public ResponseEntity<String> profile() {
		String output = "                            .-\"\"\"-.    __                         \n" + 
				"                            /       \\.-\"  \"-.                      \n" + 
				"                         __:  :\\     ;       `.                    \n" + 
				"                  _._.-\"\"  :  ; `.   :   _     \\                   \n" + 
				"                .'   \"-.  \"   :   \\ /;    \\    .^.              .-,\n" + 
				"    .-\".       :        `.     \\_.' \\'   .'; .'   `.            `dP\n" + 
				" ,-\"    \\      ;\\         \\  '.     /\". /  :/       `.      __ dP_,\n" + 
				" :    '. \\_    ; `.  __.   ;_  `-._/   Y    \\         `.   ( dP\".';\n" + 
				" ;      \\  `.  :   \"-._    ; \"\"-./      ;    \"-._       `--dP .'  ;\n" + 
				":    .--.;   \\  ;      l   '.    `.     ;        \"\"--.   dP  /   / \n" + 
				";   /    :    \\/       ;\\  . \"-.   \\___/            __\\dP .-\"_.-\"  \n" + 
				";  /     L_    \\`.    :  \"-.J   \"-._/  \"\"-._       ( dP\\ /   /     \n" + 
				": :      ; \\    `.`.  ;     /\"+.     \"\"-.   \"\"--.._dP-, `._.\"      \n" + 
				" \\;     :   \\     `.`-'   _/ /  \"-.___   \"         \\`-'            \n" + 
				"  `.    ;    \\      `._.-\"  (     (\"--..__..---g,   \\              \n" + 
				"    `. :      ;             /\\  .-\"\\       ,-dP ;    ;             \n" + 
				"      \\;   .-';    _   _.--\"  \\/    `._,-.-dP-' |    ;             \n" + 
				"       :     :---\"\" \"\"\"        `.     _:'.`.\\   :    ;\\            \n" + 
				"        \\  , :              bug  \"-. (,j\\ ` /   ;\\(// \\\\           \n" + 
				"         `:   \\                     \"dP__.-\"    '-\\\\   \\;          \n" + 
				"           \\   :                .--dP,             \\;              \n" + 
				"            `--'                `dP`-'                             \n" + 
				"                              .-j                                  \n" + 
				"                              `-:_                                 \n" + 
				"                                 \\)                                \n" + 
				"                                  `--'";
		return ResponseEntity.ok(output);
	}
}
