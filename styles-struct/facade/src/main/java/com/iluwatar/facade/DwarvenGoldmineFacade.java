package com.iluwatar.facade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.iluwatar.facade.service.AbsDwarvenMineWorker;
import com.iluwatar.facade.service.DwarvenCartOperator;
import com.iluwatar.facade.service.DwarvenGoldDigger;
import com.iluwatar.facade.service.DwarvenTunnelDigger;

/**
 * 
 * DwarvenGoldmineFacade provides a single interface
 * through which users can operate the subsystems.
 * 
 * This makes the goldmine easier to operate and
 * cuts the dependencies from the goldmine user to
 * the subsystems.
 *
 */
public class DwarvenGoldmineFacade {

	private final List<AbsDwarvenMineWorker> workers;

	public DwarvenGoldmineFacade() {
		workers = new ArrayList<>();
		workers.add(new DwarvenGoldDigger());
		workers.add(new DwarvenCartOperator());
		workers.add(new DwarvenTunnelDigger());
	}

	public void startNewDay() {
        makeActions(workers, AbsDwarvenMineWorker.Action.WAKE_UP, AbsDwarvenMineWorker.Action.GO_TO_MINE);
	}

	public void digOutGold() {
        makeActions(workers, AbsDwarvenMineWorker.Action.WORK);
	}

	public void endDay() {
        makeActions(workers, AbsDwarvenMineWorker.Action.GO_HOME, AbsDwarvenMineWorker.Action.GO_TO_SLEEP);
	}

    private void makeActions(Collection<AbsDwarvenMineWorker> workers, AbsDwarvenMineWorker.Action... actions) {
        for (AbsDwarvenMineWorker worker : workers) {
            worker.action(actions);
        }
    }
}
