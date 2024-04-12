package com.masai.app.service;

import com.masai.app.exception.SlotNotFoundException;
import com.masai.app.model.Slot;

public interface SlotService {

	public Slot deleteSlot(Integer slotId) throws SlotNotFoundException;

}
