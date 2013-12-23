/*  MonkeyTalk - a cross-platform functional testing tool
    Copyright (C) 2013 Gorilla Logic, Inc.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>. */
package com.gorillalogic.monkeytalk.java.error;

/**
 * Thrown to trigger a test failure (as opposed to throwing {@link MonkeyTalkError} which triggers a
 * test error).
 */
public class MonkeyTalkFailure extends AssertionError {
	private static final long serialVersionUID = 1L;

	/**
	 * Construct a {@code MonkeyTalkFailure} without a failure message.
	 */
	public MonkeyTalkFailure() {
		super();
	}

	/**
	 * Construct a {@code MonkeyTalkFailure} with the given failure message.
	 * 
	 * @param message
	 *            the failure message
	 */
	public MonkeyTalkFailure(Object message) {
		super(message);
	}
}
