#
# Copyright (c) 2005 Red Hat, Inc.
#
# Written by Joel Martin <jmartin@redhat.com>
#
# This file is part of Smart Package Manager.
#
# Smart Package Manager is free software; you can redistribute it and/or
# modify it under the terms of the GNU General Public License as published
# by the Free Software Foundation; either version 2 of the License, or (at
# your option) any later version.
#
# Smart Package Manager is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
# General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with Smart Package Manager; if not, write to the Free Software
# Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
#

from smart import _

kind = "package"

name = _("RPM RHN")

description = _("""
An RHN base repo
""")


fields = [("baseurl", _("Base URL"), str, None,
           _("URL where repodata/ subdirectory is found")),
          ("channel_info", _("Channel Info"), list, None,
           _("RHN CHannel information"))]