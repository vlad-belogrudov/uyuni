/**
 * Copyright (c) 2015 SUSE LLC
 *
 * This software is licensed to you under the GNU General Public License,
 * version 2 (GPLv2). There is NO WARRANTY for this software, express or
 * implied, including the implied warranties of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. You should have received a copy of GPLv2
 * along with this software; if not, see
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.txt.
 *
 * Red Hat trademarks are not licensed under GPLv2. No permission is
 * granted to use or replicate Red Hat trademarks that are incorporated
 * in this software or its documentation.
 */
package com.suse.manager.webui.utils.salt.custom;

import com.google.gson.reflect.TypeToken;
import com.suse.salt.netapi.calls.LocalCall;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Custom Salt module udevdb.
 */
public class Udevdb {

    private Udevdb() { }

    /**
     * Call udevdb.exportdb.
     * @return a {@link LocalCall} to pass to the SaltClient
     */
    public static LocalCall<List<Map<String, Object>>> exportdb() {
        LinkedHashMap<String, Object> args = new LinkedHashMap<>();
        return new LocalCall<>("udevdb.exportdb", Optional.empty(), Optional.of(args),
                new TypeToken<List<Map<String, Object>>>() { });
    }

}