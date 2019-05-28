package com.server.game;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Kolisek
 */
@Data
@AllArgsConstructor
public class Event {
	private String eventId;
	private String eventDt;
}