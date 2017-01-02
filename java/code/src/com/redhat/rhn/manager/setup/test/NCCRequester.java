/**
 * Copyright (c) 2014 SUSE LLC
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
package com.redhat.rhn.manager.setup.test;

import com.redhat.rhn.manager.setup.NCCClient;
import com.redhat.rhn.manager.setup.NCCException;

import java.net.URI;
import java.util.concurrent.Callable;

/**
 * Convenience requester that is specific to make NCC requests.
 *
 * @param <T> a generic result type
 */
public abstract class NCCRequester<T> implements Callable<T> {
    /** The uri. */
    private URI uri;

    /**
     * Instantiates a new NCC requester.
     *
     * @param uriIn the uri
     */
    public NCCRequester(URI uriIn) {
        uri = uriIn;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T call() {
        T ret = null;
        try {
            ret = request(new NCCClient(uri.toString()));
        }
        catch (NCCException e) {
            // Catch it in here, we are expecting it
        }
        return ret;
    }

    /**
     * Run a request to SUSE Studio.
     *
     * @param nccClient the NCC client to make the request
     * @return a generic request result
     * @throws NCCException if the request has an error
     */
    public abstract T request(NCCClient nccClient) throws NCCException;

}